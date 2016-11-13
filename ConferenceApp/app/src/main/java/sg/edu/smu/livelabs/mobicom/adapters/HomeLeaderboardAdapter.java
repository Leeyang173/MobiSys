package sg.edu.smu.livelabs.mobicom.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import sg.edu.smu.livelabs.mobicom.R;
import sg.edu.smu.livelabs.mobicom.net.item.RankingItem;
import sg.edu.smu.livelabs.mobicom.services.GameService;
import sg.edu.smu.livelabs.mobicom.util.Util;

/**
 * Created by smu on 21/4/16.
 */
public class HomeLeaderboardAdapter extends BaseAdapter {
    private List<RankingItem> rankingItems;
    private Context context;
    private long userId;

    public HomeLeaderboardAdapter(Context context, List<RankingItem> rankingItems, long userId){
        this.context = context;
        this.rankingItems = rankingItems;
        this.userId = userId;
    }

    @Override
    public int getCount() {
        return rankingItems.size();
    }

    @Override
    public RankingItem getItem(int position) {
        if(rankingItems != null && rankingItems.size() >0)
            return rankingItems.get(position);
        else
            return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }

    public void update(List<RankingItem> rankingItems){
        this.rankingItems = rankingItems;
        notifyDataSetChanged();
        notifyDataSetInvalidated();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(R.layout.home_leaderboard_item, parent, false);

            holder.view = view;

            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }

        // set value
        holder.backgroundView = (View) view.findViewById(R.id.background_view);
        holder.nameShortFormTV = (TextView) view.findViewById(R.id.name_short_form);
        holder.nameTV = (TextView) view.findViewById(R.id.name_tv);
        holder.pointsTV = (TextView) view.findViewById(R.id.points_tv);
        holder.avatar = (CircleImageView) view.findViewById(R.id.avatar_image);
        holder.item = rankingItems.get(position);

//        holder.user = AttendeesService.getInstance().getAttendeesByUID(Long.parseLong(item.userId));


        Picasso.with(this.context).cancelRequest(holder.avatar);
        if (holder.item != null) {

            if (holder.item.userId.equals(Long.toString(userId))) {
                holder.backgroundView.setAlpha(1.0f);
            } else {
                holder.backgroundView.setAlpha(0.6f);
            }

            if (holder.item.avatarId != null && !holder.item.avatarId.equals("")) {
                holder.nameShortFormTV.setVisibility(View.GONE);

                try {
                    Picasso.with(context).load(Util.getPhotoUrlFromId(holder.item.avatarId, 96))
                            .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
                            .networkPolicy(NetworkPolicy.NO_CACHE)
                            .placeholder(R.drawable.icon_no_profile).into(holder.avatar, new com.squareup.picasso.Callback() {
                        @Override
                        public void onSuccess() {
                            holder.nameShortFormTV.setVisibility(View.GONE);
                        }

                        @Override
                        public void onError() { //when failed to load, draw a rect on top of the noavatar and add the name short form
                            GameService.getInstance().drawNameShort(holder.item.name, holder.avatar, holder.nameShortFormTV);
                        }
                    });
                }
                catch(Throwable e){
                    Log.d("AAA", "HomeLeaderboardAdapter:"+e.toString());
                }
            } else {
                GameService.getInstance().drawNameShort(holder.item.name, holder.avatar, holder.nameShortFormTV);
            }


            holder.nameTV.setText(holder.item.name);
            holder.pointsTV.setText("" + holder.item.rank);
        }


        return view;
    }

    private class ViewHolder{
        public View backgroundView;
        public CircleImageView avatar;
        public TextView pointsTV;
        public TextView nameTV;
        public TextView nameShortFormTV;
        public RankingItem item;
        View view;
    }

    private Bitmap drawRectToAvatar(){
        BitmapFactory.Options myOptions = new BitmapFactory.Options();
        myOptions.inDither = true;
        myOptions.inScaled = false;
        myOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;// important
        myOptions.inPurgeable = true;

        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.next,myOptions);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(context.getResources().getColor(R.color.avatar_grey));

        Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
        Bitmap mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);

        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                context.getResources().getDimension(R.dimen.item_height_large),
                context.getResources().getDisplayMetrics());
        Canvas canvas = new Canvas(mutableBitmap);
        canvas.drawRect(0, 0, px, px, paint);
        return mutableBitmap;
    }
}