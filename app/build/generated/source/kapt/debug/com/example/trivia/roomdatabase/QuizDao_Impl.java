package com.example.trivia.roomdatabase;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuizDao_Impl implements QuizDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Quiz> __insertionAdapterOfQuiz;

  public QuizDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuiz = new EntityInsertionAdapter<Quiz>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Quiz` (`quizId`,`userName`,`gameDateTime`,`cricketerName`,`flagColor`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Quiz value) {
        if (value.getQuizId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getQuizId());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        if (value.getGameDateTime() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGameDateTime());
        }
        if (value.getCricketerName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCricketerName());
        }
        if (value.getFlagColor() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFlagColor());
        }
      }
    };
  }

  @Override
  public Object insert(final Quiz user, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfQuiz.insertAndReturnId(user);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getHistoryData(final Continuation<? super List<Quiz>> continuation) {
    final String _sql = "select * from Quiz";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Quiz>>() {
      @Override
      public List<Quiz> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfQuizId = CursorUtil.getColumnIndexOrThrow(_cursor, "quizId");
          final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
          final int _cursorIndexOfGameDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "gameDateTime");
          final int _cursorIndexOfCricketerName = CursorUtil.getColumnIndexOrThrow(_cursor, "cricketerName");
          final int _cursorIndexOfFlagColor = CursorUtil.getColumnIndexOrThrow(_cursor, "flagColor");
          final List<Quiz> _result = new ArrayList<Quiz>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Quiz _item;
            final Integer _tmpQuizId;
            if (_cursor.isNull(_cursorIndexOfQuizId)) {
              _tmpQuizId = null;
            } else {
              _tmpQuizId = _cursor.getInt(_cursorIndexOfQuizId);
            }
            final String _tmpUserName;
            if (_cursor.isNull(_cursorIndexOfUserName)) {
              _tmpUserName = null;
            } else {
              _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
            }
            final String _tmpGameDateTime;
            if (_cursor.isNull(_cursorIndexOfGameDateTime)) {
              _tmpGameDateTime = null;
            } else {
              _tmpGameDateTime = _cursor.getString(_cursorIndexOfGameDateTime);
            }
            final String _tmpCricketerName;
            if (_cursor.isNull(_cursorIndexOfCricketerName)) {
              _tmpCricketerName = null;
            } else {
              _tmpCricketerName = _cursor.getString(_cursorIndexOfCricketerName);
            }
            final String _tmpFlagColor;
            if (_cursor.isNull(_cursorIndexOfFlagColor)) {
              _tmpFlagColor = null;
            } else {
              _tmpFlagColor = _cursor.getString(_cursorIndexOfFlagColor);
            }
            _item = new Quiz(_tmpQuizId,_tmpUserName,_tmpGameDateTime,_tmpCricketerName,_tmpFlagColor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
