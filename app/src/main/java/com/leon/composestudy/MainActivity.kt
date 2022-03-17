package com.leon.composestudy

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.leon.composestudy.entity.MessageEntity
import com.leon.composestudy.ui.theme.ComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(message = MessageEntity("hello leon","this is compose demo"))
        }
    }
}

@Composable
fun MessageCard(message: MessageEntity) {
    Row {
        Image(painter = painterResource(id = R.drawable.train_vector),
            contentDescription = "我是无障碍描述字段")
        Column {
            Text(message.name)
            Text(message.message)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeStudyTheme {
        MessageCard(MessageEntity("hello leon","this is compose demo"))
    }
}