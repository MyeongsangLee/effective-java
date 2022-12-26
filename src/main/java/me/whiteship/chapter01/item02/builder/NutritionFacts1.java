package me.whiteship.chapter01.item02.builder;

// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취했다. (17~18쪽)
public class NutritionFacts1 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public static void main(String[] args) {
            NutritionFacts1 facts1 = new Builder(10, 20)
                    .calories(10)
                    .carbohydrate(10)
                    .fat(10)
                    .calories(10)
                    .sodium(10)
                    .build();
        }

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            calories = calories;
            return this;
        }
        public Builder fat(int fat) {
            fat = fat;
            return this;
        }
        public Builder sodium(int sodium) {
            calories = sodium;
            return this;
        }
        public Builder carbohydrate(int carbohydrate) {
            carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts1 build() {
            return new NutritionFacts1(this);

        }
    }

    public NutritionFacts1(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
