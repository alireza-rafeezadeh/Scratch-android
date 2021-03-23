package common

object Libs {

    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha09"

    object Navigation {
        private const val version = "2.3.0"
        const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"

        private const val nav_compose_version = "1.0.0-alpha09"
        const val navCompose = "androidx.navigation:navigation-compose:$nav_compose_version"



    }

}