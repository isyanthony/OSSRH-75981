package club.syanthony.algorithm.data_structer;

/**
 * @author: Anthony
 * @Date: 2021/12/11 16:52
 * @Version: 1.0.0
 * @description: Pair 数据对
 */
import java.io.Serializable;

public class Pair<F , S> implements Serializable {

    F first;

    S second;


    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F , S> Pair<F , S> create(F first, S second){
        return new Pair<F , S>(first , second);
    }

    @Override
    public String toString() {
        return "[first=" + first + ", second=" + second + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        if (first == null) {
            if (other.first != null)
                return false;
        } else if (!first.equals(other.first))
            return false;
        if (second == null) {
            if (other.second != null)
                return false;
        } else if (!second.equals(other.second))
            return false;
        return true;
    }
}


