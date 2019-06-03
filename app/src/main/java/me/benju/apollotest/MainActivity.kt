package me.benju.apollotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apollographql.apollo.ApolloClient

class MainActivity : AppCompatActivity() {

    private val BASE_URL = "server.com/graphql"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val okHttpClient = OkHttpClient.Builder().build() // Problem =  Unresolved reference: OkHttpClient

        val apolloClient = ApolloClient.builder()
            .serverUrl(BASE_URL)
            .okHttpClient(okHttpClient) // Problem here : Cannot access class 'okhttp3.OkHttpClient'. Check your module classpath for missing or conflicting dependencies
            .build()
    }

}