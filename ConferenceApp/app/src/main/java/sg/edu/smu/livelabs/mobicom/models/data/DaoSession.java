package sg.edu.smu.livelabs.mobicom.models.data;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import sg.edu.smu.livelabs.mobicom.models.data.EventEntity;
import sg.edu.smu.livelabs.mobicom.models.data.GameEventEntity;
import sg.edu.smu.livelabs.mobicom.models.data.PaperEventEntity;
import sg.edu.smu.livelabs.mobicom.models.data.CommentEntity;
import sg.edu.smu.livelabs.mobicom.models.data.TopicEntity;
import sg.edu.smu.livelabs.mobicom.models.data.AttendeeEntity;
import sg.edu.smu.livelabs.mobicom.models.data.PaperEntity;
import sg.edu.smu.livelabs.mobicom.models.data.ChatRoomEntity;
import sg.edu.smu.livelabs.mobicom.models.data.ChatMessageEntity;
import sg.edu.smu.livelabs.mobicom.models.data.MasterPointEntity;
import sg.edu.smu.livelabs.mobicom.models.data.InterestsEntity;
import sg.edu.smu.livelabs.mobicom.models.data.BeaconEntity;
import sg.edu.smu.livelabs.mobicom.models.data.SearchKeyEntity;
import sg.edu.smu.livelabs.mobicom.models.data.IceBreakerFriendsEntity;
import sg.edu.smu.livelabs.mobicom.models.data.IceBreakerLeaderBoardEntity;
import sg.edu.smu.livelabs.mobicom.models.data.SurveyEntity;
import sg.edu.smu.livelabs.mobicom.models.data.BadgeEntity;
import sg.edu.smu.livelabs.mobicom.models.data.BadgeRuleEntity;
import sg.edu.smu.livelabs.mobicom.models.data.UserBadgeEntity;
import sg.edu.smu.livelabs.mobicom.models.data.GameEntity;
import sg.edu.smu.livelabs.mobicom.models.data.ScavengerEntity;
import sg.edu.smu.livelabs.mobicom.models.data.ScavengerGroupDetailEntity;
import sg.edu.smu.livelabs.mobicom.models.data.GameListEntity;
import sg.edu.smu.livelabs.mobicom.models.data.ScavengerWinnersEntity;
import sg.edu.smu.livelabs.mobicom.models.data.InboxEntity;

import sg.edu.smu.livelabs.mobicom.models.data.EventEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.GameEventEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.PaperEventEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.CommentEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.TopicEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.AttendeeEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.PaperEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.ChatRoomEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.ChatMessageEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.MasterPointEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.InterestsEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.BeaconEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.SearchKeyEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.IceBreakerFriendsEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.IceBreakerLeaderBoardEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.SurveyEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.BadgeEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.BadgeRuleEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.UserBadgeEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.GameEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.ScavengerEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.ScavengerGroupDetailEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.GameListEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.ScavengerWinnersEntityDao;
import sg.edu.smu.livelabs.mobicom.models.data.InboxEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig eventEntityDaoConfig;
    private final DaoConfig gameEventEntityDaoConfig;
    private final DaoConfig paperEventEntityDaoConfig;
    private final DaoConfig commentEntityDaoConfig;
    private final DaoConfig topicEntityDaoConfig;
    private final DaoConfig attendeeEntityDaoConfig;
    private final DaoConfig paperEntityDaoConfig;
    private final DaoConfig chatRoomEntityDaoConfig;
    private final DaoConfig chatMessageEntityDaoConfig;
    private final DaoConfig masterPointEntityDaoConfig;
    private final DaoConfig interestsEntityDaoConfig;
    private final DaoConfig beaconEntityDaoConfig;
    private final DaoConfig searchKeyEntityDaoConfig;
    private final DaoConfig iceBreakerFriendsEntityDaoConfig;
    private final DaoConfig iceBreakerLeaderBoardEntityDaoConfig;
    private final DaoConfig surveyEntityDaoConfig;
    private final DaoConfig badgeEntityDaoConfig;
    private final DaoConfig badgeRuleEntityDaoConfig;
    private final DaoConfig userBadgeEntityDaoConfig;
    private final DaoConfig gameEntityDaoConfig;
    private final DaoConfig scavengerEntityDaoConfig;
    private final DaoConfig scavengerGroupDetailEntityDaoConfig;
    private final DaoConfig gameListEntityDaoConfig;
    private final DaoConfig scavengerWinnersEntityDaoConfig;
    private final DaoConfig inboxEntityDaoConfig;

    private final EventEntityDao eventEntityDao;
    private final GameEventEntityDao gameEventEntityDao;
    private final PaperEventEntityDao paperEventEntityDao;
    private final CommentEntityDao commentEntityDao;
    private final TopicEntityDao topicEntityDao;
    private final AttendeeEntityDao attendeeEntityDao;
    private final PaperEntityDao paperEntityDao;
    private final ChatRoomEntityDao chatRoomEntityDao;
    private final ChatMessageEntityDao chatMessageEntityDao;
    private final MasterPointEntityDao masterPointEntityDao;
    private final InterestsEntityDao interestsEntityDao;
    private final BeaconEntityDao beaconEntityDao;
    private final SearchKeyEntityDao searchKeyEntityDao;
    private final IceBreakerFriendsEntityDao iceBreakerFriendsEntityDao;
    private final IceBreakerLeaderBoardEntityDao iceBreakerLeaderBoardEntityDao;
    private final SurveyEntityDao surveyEntityDao;
    private final BadgeEntityDao badgeEntityDao;
    private final BadgeRuleEntityDao badgeRuleEntityDao;
    private final UserBadgeEntityDao userBadgeEntityDao;
    private final GameEntityDao gameEntityDao;
    private final ScavengerEntityDao scavengerEntityDao;
    private final ScavengerGroupDetailEntityDao scavengerGroupDetailEntityDao;
    private final GameListEntityDao gameListEntityDao;
    private final ScavengerWinnersEntityDao scavengerWinnersEntityDao;
    private final InboxEntityDao inboxEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        eventEntityDaoConfig = daoConfigMap.get(EventEntityDao.class).clone();
        eventEntityDaoConfig.initIdentityScope(type);

        gameEventEntityDaoConfig = daoConfigMap.get(GameEventEntityDao.class).clone();
        gameEventEntityDaoConfig.initIdentityScope(type);

        paperEventEntityDaoConfig = daoConfigMap.get(PaperEventEntityDao.class).clone();
        paperEventEntityDaoConfig.initIdentityScope(type);

        commentEntityDaoConfig = daoConfigMap.get(CommentEntityDao.class).clone();
        commentEntityDaoConfig.initIdentityScope(type);

        topicEntityDaoConfig = daoConfigMap.get(TopicEntityDao.class).clone();
        topicEntityDaoConfig.initIdentityScope(type);

        attendeeEntityDaoConfig = daoConfigMap.get(AttendeeEntityDao.class).clone();
        attendeeEntityDaoConfig.initIdentityScope(type);

        paperEntityDaoConfig = daoConfigMap.get(PaperEntityDao.class).clone();
        paperEntityDaoConfig.initIdentityScope(type);

        chatRoomEntityDaoConfig = daoConfigMap.get(ChatRoomEntityDao.class).clone();
        chatRoomEntityDaoConfig.initIdentityScope(type);

        chatMessageEntityDaoConfig = daoConfigMap.get(ChatMessageEntityDao.class).clone();
        chatMessageEntityDaoConfig.initIdentityScope(type);

        masterPointEntityDaoConfig = daoConfigMap.get(MasterPointEntityDao.class).clone();
        masterPointEntityDaoConfig.initIdentityScope(type);

        interestsEntityDaoConfig = daoConfigMap.get(InterestsEntityDao.class).clone();
        interestsEntityDaoConfig.initIdentityScope(type);

        beaconEntityDaoConfig = daoConfigMap.get(BeaconEntityDao.class).clone();
        beaconEntityDaoConfig.initIdentityScope(type);

        searchKeyEntityDaoConfig = daoConfigMap.get(SearchKeyEntityDao.class).clone();
        searchKeyEntityDaoConfig.initIdentityScope(type);

        iceBreakerFriendsEntityDaoConfig = daoConfigMap.get(IceBreakerFriendsEntityDao.class).clone();
        iceBreakerFriendsEntityDaoConfig.initIdentityScope(type);

        iceBreakerLeaderBoardEntityDaoConfig = daoConfigMap.get(IceBreakerLeaderBoardEntityDao.class).clone();
        iceBreakerLeaderBoardEntityDaoConfig.initIdentityScope(type);

        surveyEntityDaoConfig = daoConfigMap.get(SurveyEntityDao.class).clone();
        surveyEntityDaoConfig.initIdentityScope(type);

        badgeEntityDaoConfig = daoConfigMap.get(BadgeEntityDao.class).clone();
        badgeEntityDaoConfig.initIdentityScope(type);

        badgeRuleEntityDaoConfig = daoConfigMap.get(BadgeRuleEntityDao.class).clone();
        badgeRuleEntityDaoConfig.initIdentityScope(type);

        userBadgeEntityDaoConfig = daoConfigMap.get(UserBadgeEntityDao.class).clone();
        userBadgeEntityDaoConfig.initIdentityScope(type);

        gameEntityDaoConfig = daoConfigMap.get(GameEntityDao.class).clone();
        gameEntityDaoConfig.initIdentityScope(type);

        scavengerEntityDaoConfig = daoConfigMap.get(ScavengerEntityDao.class).clone();
        scavengerEntityDaoConfig.initIdentityScope(type);

        scavengerGroupDetailEntityDaoConfig = daoConfigMap.get(ScavengerGroupDetailEntityDao.class).clone();
        scavengerGroupDetailEntityDaoConfig.initIdentityScope(type);

        gameListEntityDaoConfig = daoConfigMap.get(GameListEntityDao.class).clone();
        gameListEntityDaoConfig.initIdentityScope(type);

        scavengerWinnersEntityDaoConfig = daoConfigMap.get(ScavengerWinnersEntityDao.class).clone();
        scavengerWinnersEntityDaoConfig.initIdentityScope(type);

        inboxEntityDaoConfig = daoConfigMap.get(InboxEntityDao.class).clone();
        inboxEntityDaoConfig.initIdentityScope(type);

        eventEntityDao = new EventEntityDao(eventEntityDaoConfig, this);
        gameEventEntityDao = new GameEventEntityDao(gameEventEntityDaoConfig, this);
        paperEventEntityDao = new PaperEventEntityDao(paperEventEntityDaoConfig, this);
        commentEntityDao = new CommentEntityDao(commentEntityDaoConfig, this);
        topicEntityDao = new TopicEntityDao(topicEntityDaoConfig, this);
        attendeeEntityDao = new AttendeeEntityDao(attendeeEntityDaoConfig, this);
        paperEntityDao = new PaperEntityDao(paperEntityDaoConfig, this);
        chatRoomEntityDao = new ChatRoomEntityDao(chatRoomEntityDaoConfig, this);
        chatMessageEntityDao = new ChatMessageEntityDao(chatMessageEntityDaoConfig, this);
        masterPointEntityDao = new MasterPointEntityDao(masterPointEntityDaoConfig, this);
        interestsEntityDao = new InterestsEntityDao(interestsEntityDaoConfig, this);
        beaconEntityDao = new BeaconEntityDao(beaconEntityDaoConfig, this);
        searchKeyEntityDao = new SearchKeyEntityDao(searchKeyEntityDaoConfig, this);
        iceBreakerFriendsEntityDao = new IceBreakerFriendsEntityDao(iceBreakerFriendsEntityDaoConfig, this);
        iceBreakerLeaderBoardEntityDao = new IceBreakerLeaderBoardEntityDao(iceBreakerLeaderBoardEntityDaoConfig, this);
        surveyEntityDao = new SurveyEntityDao(surveyEntityDaoConfig, this);
        badgeEntityDao = new BadgeEntityDao(badgeEntityDaoConfig, this);
        badgeRuleEntityDao = new BadgeRuleEntityDao(badgeRuleEntityDaoConfig, this);
        userBadgeEntityDao = new UserBadgeEntityDao(userBadgeEntityDaoConfig, this);
        gameEntityDao = new GameEntityDao(gameEntityDaoConfig, this);
        scavengerEntityDao = new ScavengerEntityDao(scavengerEntityDaoConfig, this);
        scavengerGroupDetailEntityDao = new ScavengerGroupDetailEntityDao(scavengerGroupDetailEntityDaoConfig, this);
        gameListEntityDao = new GameListEntityDao(gameListEntityDaoConfig, this);
        scavengerWinnersEntityDao = new ScavengerWinnersEntityDao(scavengerWinnersEntityDaoConfig, this);
        inboxEntityDao = new InboxEntityDao(inboxEntityDaoConfig, this);

        registerDao(EventEntity.class, eventEntityDao);
        registerDao(GameEventEntity.class, gameEventEntityDao);
        registerDao(PaperEventEntity.class, paperEventEntityDao);
        registerDao(CommentEntity.class, commentEntityDao);
        registerDao(TopicEntity.class, topicEntityDao);
        registerDao(AttendeeEntity.class, attendeeEntityDao);
        registerDao(PaperEntity.class, paperEntityDao);
        registerDao(ChatRoomEntity.class, chatRoomEntityDao);
        registerDao(ChatMessageEntity.class, chatMessageEntityDao);
        registerDao(MasterPointEntity.class, masterPointEntityDao);
        registerDao(InterestsEntity.class, interestsEntityDao);
        registerDao(BeaconEntity.class, beaconEntityDao);
        registerDao(SearchKeyEntity.class, searchKeyEntityDao);
        registerDao(IceBreakerFriendsEntity.class, iceBreakerFriendsEntityDao);
        registerDao(IceBreakerLeaderBoardEntity.class, iceBreakerLeaderBoardEntityDao);
        registerDao(SurveyEntity.class, surveyEntityDao);
        registerDao(BadgeEntity.class, badgeEntityDao);
        registerDao(BadgeRuleEntity.class, badgeRuleEntityDao);
        registerDao(UserBadgeEntity.class, userBadgeEntityDao);
        registerDao(GameEntity.class, gameEntityDao);
        registerDao(ScavengerEntity.class, scavengerEntityDao);
        registerDao(ScavengerGroupDetailEntity.class, scavengerGroupDetailEntityDao);
        registerDao(GameListEntity.class, gameListEntityDao);
        registerDao(ScavengerWinnersEntity.class, scavengerWinnersEntityDao);
        registerDao(InboxEntity.class, inboxEntityDao);
    }
    
    public void clear() {
        eventEntityDaoConfig.getIdentityScope().clear();
        gameEventEntityDaoConfig.getIdentityScope().clear();
        paperEventEntityDaoConfig.getIdentityScope().clear();
        commentEntityDaoConfig.getIdentityScope().clear();
        topicEntityDaoConfig.getIdentityScope().clear();
        attendeeEntityDaoConfig.getIdentityScope().clear();
        paperEntityDaoConfig.getIdentityScope().clear();
        chatRoomEntityDaoConfig.getIdentityScope().clear();
        chatMessageEntityDaoConfig.getIdentityScope().clear();
        masterPointEntityDaoConfig.getIdentityScope().clear();
        interestsEntityDaoConfig.getIdentityScope().clear();
        beaconEntityDaoConfig.getIdentityScope().clear();
        searchKeyEntityDaoConfig.getIdentityScope().clear();
        iceBreakerFriendsEntityDaoConfig.getIdentityScope().clear();
        iceBreakerLeaderBoardEntityDaoConfig.getIdentityScope().clear();
        surveyEntityDaoConfig.getIdentityScope().clear();
        badgeEntityDaoConfig.getIdentityScope().clear();
        badgeRuleEntityDaoConfig.getIdentityScope().clear();
        userBadgeEntityDaoConfig.getIdentityScope().clear();
        gameEntityDaoConfig.getIdentityScope().clear();
        scavengerEntityDaoConfig.getIdentityScope().clear();
        scavengerGroupDetailEntityDaoConfig.getIdentityScope().clear();
        gameListEntityDaoConfig.getIdentityScope().clear();
        scavengerWinnersEntityDaoConfig.getIdentityScope().clear();
        inboxEntityDaoConfig.getIdentityScope().clear();
    }

    public EventEntityDao getEventEntityDao() {
        return eventEntityDao;
    }

    public GameEventEntityDao getGameEventEntityDao() {
        return gameEventEntityDao;
    }

    public PaperEventEntityDao getPaperEventEntityDao() {
        return paperEventEntityDao;
    }

    public CommentEntityDao getCommentEntityDao() {
        return commentEntityDao;
    }

    public TopicEntityDao getTopicEntityDao() {
        return topicEntityDao;
    }

    public AttendeeEntityDao getAttendeeEntityDao() {
        return attendeeEntityDao;
    }

    public PaperEntityDao getPaperEntityDao() {
        return paperEntityDao;
    }

    public ChatRoomEntityDao getChatRoomEntityDao() {
        return chatRoomEntityDao;
    }

    public ChatMessageEntityDao getChatMessageEntityDao() {
        return chatMessageEntityDao;
    }

    public MasterPointEntityDao getMasterPointEntityDao() {
        return masterPointEntityDao;
    }

    public InterestsEntityDao getInterestsEntityDao() {
        return interestsEntityDao;
    }

    public BeaconEntityDao getBeaconEntityDao() {
        return beaconEntityDao;
    }

    public SearchKeyEntityDao getSearchKeyEntityDao() {
        return searchKeyEntityDao;
    }

    public IceBreakerFriendsEntityDao getIceBreakerFriendsEntityDao() {
        return iceBreakerFriendsEntityDao;
    }

    public IceBreakerLeaderBoardEntityDao getIceBreakerLeaderBoardEntityDao() {
        return iceBreakerLeaderBoardEntityDao;
    }

    public SurveyEntityDao getSurveyEntityDao() {
        return surveyEntityDao;
    }

    public BadgeEntityDao getBadgeEntityDao() {
        return badgeEntityDao;
    }

    public BadgeRuleEntityDao getBadgeRuleEntityDao() {
        return badgeRuleEntityDao;
    }

    public UserBadgeEntityDao getUserBadgeEntityDao() {
        return userBadgeEntityDao;
    }

    public GameEntityDao getGameEntityDao() {
        return gameEntityDao;
    }

    public ScavengerEntityDao getScavengerEntityDao() {
        return scavengerEntityDao;
    }

    public ScavengerGroupDetailEntityDao getScavengerGroupDetailEntityDao() {
        return scavengerGroupDetailEntityDao;
    }

    public GameListEntityDao getGameListEntityDao() {
        return gameListEntityDao;
    }

    public ScavengerWinnersEntityDao getScavengerWinnersEntityDao() {
        return scavengerWinnersEntityDao;
    }

    public InboxEntityDao getInboxEntityDao() {
        return inboxEntityDao;
    }

}