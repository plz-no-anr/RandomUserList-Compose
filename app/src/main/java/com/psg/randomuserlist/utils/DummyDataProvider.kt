package com.psg.randomuserlist.utils

data class RandomUser(
    val name: String = "이름은??",
    val description: String = "안녕하세요오오오오",
    val profileImage: String = "https://randomuser.me/api/portraits/women/79.jpg"
)

object DummyDataProvider {
    val userList = List<RandomUser>(200){ RandomUser()}

}