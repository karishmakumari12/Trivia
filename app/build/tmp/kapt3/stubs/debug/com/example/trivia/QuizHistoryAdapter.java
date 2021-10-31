package com.example.trivia;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/example/trivia/QuizHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/trivia/QuizHistoryAdapter$QuizViewHolder;", "quizList", "", "Lcom/example/trivia/roomdatabase/Quiz;", "(Ljava/util/List;)V", "getQuizList", "()Ljava/util/List;", "setQuizList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "QuizViewHolder", "app_debug"})
public final class QuizHistoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.trivia.QuizHistoryAdapter.QuizViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.trivia.roomdatabase.Quiz> quizList;
    
    public QuizHistoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.trivia.roomdatabase.Quiz> quizList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.trivia.roomdatabase.Quiz> getQuizList() {
        return null;
    }
    
    public final void setQuizList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.trivia.roomdatabase.Quiz> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.trivia.QuizHistoryAdapter.QuizViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.trivia.QuizHistoryAdapter.QuizViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/trivia/QuizHistoryAdapter$QuizViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "tv_cricketer_value", "Landroid/widget/TextView;", "getTv_cricketer_value", "()Landroid/widget/TextView;", "setTv_cricketer_value", "(Landroid/widget/TextView;)V", "tv_date_time_value", "getTv_date_time_value", "setTv_date_time_value", "tv_flag_value", "getTv_flag_value", "setTv_flag_value", "tv_name_value", "getTv_name_value", "setTv_name_value", "app_debug"})
    public static final class QuizViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tv_name_value;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tv_date_time_value;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tv_cricketer_value;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tv_flag_value;
        
        public QuizViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_name_value() {
            return null;
        }
        
        public final void setTv_name_value(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_date_time_value() {
            return null;
        }
        
        public final void setTv_date_time_value(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_cricketer_value() {
            return null;
        }
        
        public final void setTv_cricketer_value(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_flag_value() {
            return null;
        }
        
        public final void setTv_flag_value(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}