/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than pick
 *                1 if num is lower than pick
 *                0 if num is equal to pick
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            }
            else if (result == 1) {
                // Our guess is smaller → pick is higher
                start = mid + 1;
            }
            else {
                // Our guess is bigger → pick is lower
                end = mid - 1;
            }
        }

        return -1;
    }
}