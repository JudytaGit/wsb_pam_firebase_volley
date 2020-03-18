package pl.mkonkel.wsb.volley

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import org.json.JSONObject
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    //    TODO: Initialize Volley requestQueue here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendPush()
    }

    //  TODO: Add volley request invocation here.
    private fun sendPush() {
//    1) Create the notification body
//    2) use JsonObjectRequest to create Volley request
//    3) override the Headers
//    4) add created volley request to the queue
    }

    // use this success listener
    private fun responseListener(): Response.Listener<JSONObject> {
        return Response.Listener { response -> Timber.i(response.toString()) }
    }

    // use this failure listener
    private fun errorListener(): Response.ErrorListener {
        return Response.ErrorListener { error -> Timber.e(error.cause) }
    }

    //  TODO: Create the notification body here
    private fun createNotificationBody(): JSONObject {

        return JSONObject()
    }

    //    TODO: Try to use this companion object for storing JSON keys
    private companion object {
        const val SEND_URI = "https://fcm.googleapis.com/fcm/send"
    }
}
