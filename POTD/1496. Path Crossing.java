class Solution {
    public boolean isPathCrossing(String path) {
        Set<List<Integer>> t = new HashSet<>();

        List<Integer> curPos = Arrays.asList(0,0);

        t.add(new ArrayList<>(curPos));

        for (int i = 0; i < path.length(); i++) {
            char curMove = path.charAt(i);

            int cx = curPos.get(0);
            int cy = curPos.get(1);

            switch (curMove) {
                case 'N':
                    curPos.set(0, cx - 1);
                    break;

                case 'S':
                    curPos.set(0, cx + 1);
                    break;

                case 'E':
                    curPos.set(1, cy + 1);
                    break;

                case 'W':
                    curPos.set(1, cy - 1);
                    break;

                default:
                    break;
            }

            if (t.contains(curPos)) return true;

            t.add(new ArrayList<>(curPos));
        }

        return false;
    }
}
