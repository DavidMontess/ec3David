package com.example.ec3david;

import retrofit2.Call;
import retrofit2.http.GET;

public interface pokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
