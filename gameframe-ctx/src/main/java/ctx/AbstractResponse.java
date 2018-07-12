package ctx;

/**
 * 响应对象
 */
public abstract class AbstractResponse <Rp extends AbstractResponse> implements Response
{
    protected Rp orp;

    public Rp getOrp() {
        return orp;
    }

    public void setOrp(Rp orp) {
        this.orp = orp;
    }
}
