package com.mune0903.suzuri.app

const val GRANT_TYPE = "authorization_code"

const val REDIRECT_URI = "suzuriapp://callback"

const val CLIENT_ID = "n1hCaO6aWKPAV2zVmEps6oIXwoazXrmzvpjeLy8EpxM"

const val CLIENT_SECRET = "CYOiJzR-B87tDAmcSRzdeejQwT8eBcXZsBfL52QOxz4"

const val AUTH_URL = "https://suzuri.jp/oauth/authorize?client_id=" + CLIENT_ID + "&redirect_uri=" + REDIRECT_URI + "&response_type=code&scope=read+write"