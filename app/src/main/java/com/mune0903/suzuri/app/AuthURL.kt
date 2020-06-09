package com.mune0903.suzuri.app

const val GRANT_TYPE = "authorization_code"

const val REDIRECT_URI = "suzuriapp://callback"

const val CLIENT_ID = "ug7JQzRkRFGWPuTUQxTcdpi9Jm25pFGNQY1XAEQk5sA"

const val CLIENT_SECRET = "Z4yibbg9kmzfKdc7AyyE221rk1YT1OokXJ5dBNgfmkc"

const val AUTH_URL = "https://suzuri.jp/oauth/authorize?client_id=" + CLIENT_ID + "&redirect_uri=" + REDIRECT_URI + "&response_type=code&scope=read+write"