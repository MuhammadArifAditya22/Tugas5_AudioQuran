package com.example.tugas5_audioquran;


import com.example.tugas4_infosurat.Audio.Audio;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiEndpoint {
    @GET("chapters/?language=id")
    Call<Response> getSurah();
    @GET("chapters/1/info?language=id")
    Call<Response> getChapterInfo(@Path("chapter_number") String chapterNumber);
    @GET("chapter_recitations/33?")
    Call<Audio> getAudio();
}
