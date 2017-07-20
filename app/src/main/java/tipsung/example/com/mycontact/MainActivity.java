package tipsung.example.com.mycontact;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference mUsersRef = mRootRef.child("users");
        DatabaseReference mMessagesRef = mRootRef.child("messages");

        mUsersRef.child("id-12345").setValue("Jirawatee");

        FriendlyMessage friendlyMessage = new FriendlyMessage("Hello World!", "Jirawatee");
        mMessagesRef.push().setValue(friendlyMessage);
    }
}
