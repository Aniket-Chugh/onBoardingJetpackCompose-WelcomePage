package com.example.onboardingjetpackcompose.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.onboardingjetpackcompose.Screen
import com.example.onboardingjetpackcompose.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen(navController: NavController){
val pages  = listOf(
    WelcomeScreen.Welcome,
    WelcomeScreen.Details,
    WelcomeScreen.Signup
)


    val pagerState = rememberPagerState()

    HorizontalPager(count = pages.size

    , state = pagerState

    , modifier = Modifier
        .fillMaxSize()

    ) {position ->
        MainContent(item = pages[position])


    }

    HorizontalPagerIndicator(pagerState = pagerState ,

        modifier = Modifier.

            padding(start  = 186.dp , top = 480.dp )

        )



    FinishButton(modifier = Modifier
        .padding(top = 250.dp),
        pagerState = pagerState
    ){
        navController.popBackStack()
       navController.navigate(Screen.SignUpScreen.route)
    }


}


@Composable
fun MainContent(

    item : WelcomeScreen


){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Icon(painter = painterResource(id = item.icon), contentDescription = null , modifier = Modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.7f)

        )

        Text(text = item.dtitle ,

            fontSize = 40.sp,
            color = Color.Black,

fontStyle = FontStyle.Italic,

    fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 20.dp),

            )

        Text(text = item.des,

            fontSize = 19.sp,
            color = Color.Black,

            modifier = Modifier
                .padding(horizontal = 50.dp)
                .padding(6.dp),
            textAlign = TextAlign.Center


        )

    }
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun FinishButton(
    modifier: Modifier,
    pagerState : PagerState,
    onClick : () -> Unit
){
Row(
    verticalAlignment = Alignment.Bottom,
    horizontalArrangement = Arrangement.Center,
    modifier = Modifier.padding(horizontal = 50.dp)) {
    
    
    AnimatedVisibility(
        modifier = Modifier.fillMaxWidth()
        ,

        visible = pagerState.currentPage == 2) {

        Button(
            onClick = { onClick() },
modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(text = "Get Started")
        }
        
    }
    
    
    
}
}


