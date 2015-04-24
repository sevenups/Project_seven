package com.example.student.project_seven;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

public class BookDBHelper extends SQLiteOpenHelper {

    private static final String name = "movie.sqlite3";
    private static final int version = 2;


    public BookDBHelper(Context ctx) {
        super(ctx, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE book (" +
                "_id integer primary key autoincrement," +
                "branch text not null," +
                "Ant-Man int not null," +
                "Avenger int not null," +
                "Kc7 int not null);";
        db.execSQL(sql);
    }

    //  SELECT SUM(credit) cr, SUM(value*credit) gp From course;

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS book;";
        db.execSQL(sql);
        this.onCreate(db);
    }
}