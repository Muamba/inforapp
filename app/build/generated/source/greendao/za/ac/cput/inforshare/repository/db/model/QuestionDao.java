package za.ac.cput.inforshare.repository.db.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "questions".
*/
public class QuestionDao extends AbstractDao<Question, Long> {

    public static final String TABLENAME = "questions";

    /**
     * Properties of entity Question.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property QuestionText = new Property(1, String.class, "questionText", false, "question_text");
        public final static Property ImgUrl = new Property(2, String.class, "imgUrl", false, "question_img_url");
        public final static Property CreatedAt = new Property(3, String.class, "createdAt", false, "created_at");
        public final static Property UpdatedAt = new Property(4, String.class, "updatedAt", false, "updated_at");
    }

    private DaoSession daoSession;


    public QuestionDao(DaoConfig config) {
        super(config);
    }
    
    public QuestionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"questions\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"question_text\" TEXT," + // 1: questionText
                "\"question_img_url\" TEXT," + // 2: imgUrl
                "\"created_at\" TEXT," + // 3: createdAt
                "\"updated_at\" TEXT);"); // 4: updatedAt
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"questions\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Question entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String questionText = entity.getQuestionText();
        if (questionText != null) {
            stmt.bindString(2, questionText);
        }
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(3, imgUrl);
        }
 
        String createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindString(4, createdAt);
        }
 
        String updatedAt = entity.getUpdatedAt();
        if (updatedAt != null) {
            stmt.bindString(5, updatedAt);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Question entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String questionText = entity.getQuestionText();
        if (questionText != null) {
            stmt.bindString(2, questionText);
        }
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(3, imgUrl);
        }
 
        String createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindString(4, createdAt);
        }
 
        String updatedAt = entity.getUpdatedAt();
        if (updatedAt != null) {
            stmt.bindString(5, updatedAt);
        }
    }

    @Override
    protected final void attachEntity(Question entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Question readEntity(Cursor cursor, int offset) {
        Question entity = new Question( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // questionText
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // imgUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // createdAt
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // updatedAt
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Question entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setQuestionText(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImgUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCreatedAt(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUpdatedAt(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Question entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Question entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Question entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
