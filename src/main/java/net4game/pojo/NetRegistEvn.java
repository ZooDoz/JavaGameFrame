package net4game.pojo;

/**
 * @author zoodoz
 * create date 2018/7/3
 */
public class NetRegistEvn
{
    private String g;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NetRegistEvn)) return false;

        NetRegistEvn that = (NetRegistEvn) o;

        return g != null ? g.equals(that.g) : that.g == null;
    }

    @Override
    public int hashCode() {
        return g != null ? g.hashCode() : 0;
    }
}
