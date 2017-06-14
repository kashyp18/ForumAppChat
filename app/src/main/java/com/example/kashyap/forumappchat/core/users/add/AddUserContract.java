package com.example.kashyap.forumappchat.core.users.add;

import android.content.Context;

import com.google.firebase.auth.FirebaseUser;

/**
 *
 * Created by kashyap on 13/6/17.
 */

public interface AddUserContract {
    interface View {
        void onAddUserSuccess(String message);

        void onAddUserFailure(String message);
    }

    interface Presenter {
        void addUser(Context context, FirebaseUser firebaseUser);
    }

    interface Interactor {
        void addUserToDatabase(Context context, FirebaseUser firebaseUser);
    }

    interface OnUserDatabaseListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}

