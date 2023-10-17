package com.codepath.Flixster2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var bylineTextView: TextView
    private lateinit var abstractTextView: TextView
    private lateinit var vote1TextView: TextView
    private lateinit var vote2TextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        bylineTextView = findViewById(R.id.mediaByline)
        abstractTextView = findViewById(R.id.mediaAbstract)
        vote1TextView = findViewById(R.id.vote1)
        vote2TextView = findViewById(R.id.vote2)


        // TODO: Get the extra from the Intent
        val article = intent.getSerializableExtra(ARTICLE_EXTRA) as Article

        // TODO: Set the title, byline, and abstract information from the article
        titleTextView.text = article.headline
        bylineTextView.text = "Release Date: " + article.byline
        abstractTextView.text = article.abstract

        vote1TextView.text = "Rating : " + article.vAverage
        vote2TextView.text = "Votes : " + article.vCount

        // TODO: Load the media image
        Glide.with(this)
            .load(article.mediaImageUrl)
            .into(mediaImageView)
    }
}