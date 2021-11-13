package Fetcher;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.*;
import utils.HttpUtils;


public class UrlFetcher {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    static class PingBored implements Callable<BoredDTO> {
        String url;
        PingBored(String url) {
            this.url = url;
        }
        @Override
        public BoredDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            BoredDTO boredDTO = gson.fromJson(joke, BoredDTO.class);
            return boredDTO;
        }
    }

    static class PingCat implements Callable<CatDTO> {
        String url;
        PingCat(String url) {
            this.url = url;
        }
        @Override
        public CatDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            CatDTO catDTO = gson.fromJson(joke, CatDTO.class);
            return catDTO;
        }
    }

    static class PingDog implements Callable<DogDTO> {
        String url;
        PingDog(String url) {
            this.url = url;
        }
        @Override
        public DogDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            DogDTO dogDTO = gson.fromJson(joke, DogDTO.class);
            return dogDTO;
        }
    }

    static class PingGenderized implements Callable<GenderizeDTO> {
        String url;
        PingGenderized(String url) {
            this.url = url;
        }
        @Override
        public GenderizeDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            GenderizeDTO genderizeDTO = gson.fromJson(joke, GenderizeDTO.class);
            return genderizeDTO;
        }
    }

    static class PingCatImage implements Callable<CatImageDTO> {
        String url;
        PingCatImage(String url) {
            this.url = url;
        }
        @Override
        public CatImageDTO call() throws Exception {
            String catImageUrl = HttpUtils.fetchData(url);
            CatImageDTO catImageDTO = gson.fromJson(catImageUrl, CatImageDTO.class);
            return catImageDTO;
        }
    }

    static class PingRandomFact implements Callable<RandomFactDTO> {
        String url;
        PingRandomFact(String url) {
            this.url = url;
        }
        @Override
        public RandomFactDTO call() throws Exception {
            String randomFact = HttpUtils.fetchData(url);
            RandomFactDTO randomFactDTO = gson.fromJson(randomFact, RandomFactDTO.class);
            return randomFactDTO;
        }
    }

    public static OurDTO runParrallel() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<String> urls = new ArrayList<>();
        urls.add("https://www.boredapi.com/api/activity");
        urls.add("https://catfact.ninja/fact");
        urls.add("https://dog.ceo/api/breeds/image/random");
        urls.add("https://api.genderize.io/?name=luc");
        urls.add("https://thatcopy.pw/catapi/");
        urls.add("https://uselessfacts.jsph.pl/random.json?language=en");

        Future future1 = executor.submit(new PingBored(urls.get(0)));
        Future future2 = executor.submit(new PingCat(urls.get(1)));
        Future future3 = executor.submit(new PingDog(urls.get(2)));
        Future future4 = executor.submit(new PingGenderized(urls.get(3)));
        Future future5 = executor.submit(new PingCatImage(urls.get(4)));
        Future future6 = executor.submit(new PingRandomFact(urls.get(5)));

        OurDTO jokes = new OurDTO((BoredDTO) future1.get(), (CatDTO) future2.get(), (DogDTO) future3.get(), (GenderizeDTO) future4.get(), (CatImageDTO) future5.get(), (RandomFactDTO) future6.get());

        return jokes;
    }
}