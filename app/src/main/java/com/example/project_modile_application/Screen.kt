package com.example.project_modile_application


sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Search : Screen("search")
    data object Profile : Screen("profile")
}
