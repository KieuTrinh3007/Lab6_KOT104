package com.example.lab6

data class Movie(
    val title: String,
    val duration: String,
    val posterUrl: String,
    val releaseDate: String,
    val genre: String,
    val shotDescription: String,
    val year: String,

) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("Kung Fu Panda 4", "120 phút", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6Ox2Hie3li-5Bqikb8Ymv4jXJypQKm_0xvw&s", "29/02/2024","Hoạt hình", "Hay", "2024"),
            Movie("Dune - Hành tinh cát - Phần 2", "108 phút", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyCGeNiKN3ETVjtj6Hb3Fb7qv3MxtNEqJEVA&s", "29/02/2024","Hành động, khoa học, viễn tưởng", "Hay", "2024"),
            Movie("Mai", "150 phút", "https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg","29/02/2024","Tình cảm", "Hay", "2024")

        )
    }
}