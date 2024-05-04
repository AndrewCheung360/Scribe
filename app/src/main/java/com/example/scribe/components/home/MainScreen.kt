package com.example.scribe.components.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.scribe.data.Course
import com.example.scribe.viewmodel.MainViewModel
import kotlinx.coroutines.flow.StateFlow

@Composable
fun MainScreen(
    name: String,
    avatar: String,
    searchText: String,
    courses: StateFlow<List<Course>>,
    mainViewModel: MainViewModel,
    selectedCourse: (Int) -> Unit
)
{
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)) {
        GreetingSection(name = name, avatar = avatar)

        Spacer(modifier = Modifier.padding(8.dp))

        SearchBar(searchText = searchText, viewModel = mainViewModel)

//        Spacer(modifier = Modifier.padding(16.dp))

        CourseCardsSection(selectedCourse = selectedCourse, courses = courses)





    }
}