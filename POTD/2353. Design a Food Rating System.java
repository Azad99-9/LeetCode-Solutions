class FoodRatings {
    public class Combo {
        String food;
        String cuisine;
        int rating;
        Combo(String _food, String _cuisine, int _rating) {
            food = _food;
            cuisine = _cuisine;
            rating = _rating;
        }
    }

    Map<String, PriorityQueue<Combo>> cuisineMap = new HashMap<>();
    Map<String, Combo> foodMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            Combo cCombo = new Combo(foods[i], cuisines[i], ratings[i]);
            foodMap.put(cCombo.food, cCombo);
            if (cuisineMap.containsKey(cCombo.cuisine)) {
                cuisineMap.get(cCombo.cuisine).offer(cCombo);
            } else {
                PriorityQueue<Combo> pq = new PriorityQueue<>(
                    new Comparator<Combo>() {
                        @Override
                        public int compare(Combo a, Combo b) {
                            int r = b.rating - a.rating;
                            if (r == 0) return (a.food).compareTo(b.food);
                            return r;
                        }
                    }
                );
                pq.offer(cCombo);
                cuisineMap.put(cCombo.cuisine, pq);
            }

        }
    }
    
    public void changeRating(String food, int newRating) {
        Combo prevCombo = foodMap.get(food);
        Combo newCombo = new Combo(food, prevCombo.cuisine, newRating);

        foodMap.put(prevCombo.food, newCombo);

        prevCombo.food = "";

        cuisineMap.get(newCombo.cuisine).offer(newCombo);
    }
    
    public String highestRated(String cuisine) {
        while(cuisineMap.get(cuisine).peek().food.equals("")) {
            System.out.println(cuisine);
            cuisineMap.get(cuisine).poll();
        }
        return cuisineMap.get(cuisine).peek().food;
    }
}

