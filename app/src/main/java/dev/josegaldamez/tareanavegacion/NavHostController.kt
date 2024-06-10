package dev.josegaldamez.tareanavegacion

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.josegaldamez.tareanavegacion.screens.InitScreen

import dev.josegaldamez.tareanavegacion.screens.UpScreen
import dev.josegaldamez.tareanavegacion.screens.LeftScreen
import dev.josegaldamez.tareanavegacion.screens.RightScreen
import dev.josegaldamez.tareanavegacion.screens.DownScreen

@Composable
fun NavHostController(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "init",

    ){
        composable(
            route="init",
        ){ InitScreen(navController) }

        composable(
            route="up",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(700)
                )
            }
        ){ UpScreen(navController) }

        composable(
            route="left",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            }
        ){ LeftScreen(navController) }

        composable(
            route="right",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            }
        ){ RightScreen(navController) }

        composable(
            route="down",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(700)
                )
            }
        ){ DownScreen(navController) }

    }
}