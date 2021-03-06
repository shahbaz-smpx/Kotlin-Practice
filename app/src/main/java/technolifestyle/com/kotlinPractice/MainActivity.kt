package technolifestyle.com.kotlinPractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import technolifestyle.com.kotlinPractice.Utils.StringUtils.Companion.BOTTOM_SHEET_ACTIVITY_TAG
import technolifestyle.com.kotlinPractice.Utils.StringUtils.Companion.BOTTOM_SHEET_FRAGMENT_ACTIVITY
import technolifestyle.com.kotlinPractice.Utils.StringUtils.Companion.INWARD_NAVIGATION_LAYOUT_ACTIVITY
import technolifestyle.com.kotlinPractice.Utils.StringUtils.Companion.LOCATION_ACTIVITY_TAG
import technolifestyle.com.kotlinPractice.Utils.StringUtils.Companion.NOTIFICATION_ACTIVITY_TAG
import technolifestyle.com.kotlinPractice.Utils.StringUtils.Companion.TWO_PANE_LAYOUT_ACTIVITY


class MainActivity : AppCompatActivity() {

    private var practiceTopics: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        practiceTopics.add(NOTIFICATION_ACTIVITY_TAG)
        practiceTopics.add(BOTTOM_SHEET_ACTIVITY_TAG)
        practiceTopics.add(BOTTOM_SHEET_FRAGMENT_ACTIVITY)
        practiceTopics.add(INWARD_NAVIGATION_LAYOUT_ACTIVITY)
        practiceTopics.add(TWO_PANE_LAYOUT_ACTIVITY)
        practiceTopics.add(LOCATION_ACTIVITY_TAG)

        rvPractice.layoutManager = LinearLayoutManager(this)
        rvPractice.adapter = PracticeAdapter(this, practiceTopics)

    }
}
