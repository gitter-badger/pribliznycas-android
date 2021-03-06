package cz.corkscreewe.pribliznycas.app.tier;

import android.content.res.Resources;

import java.util.Calendar;

/**
 * Created by cork on 29.05.14.
 */
public class DoubleTier implements IDoubleTier {

    private ITier upTier;
    private ITier downTier;

    public DoubleTier(ITier upTier, ITier downTier) {
        this.upTier = upTier;
        this.downTier = downTier;
    }

    @Override
    public String[] getDoubleApproxTime(Calendar c, Resources res) {
        String[] doubleApproxTime = {
                upTier.getApproxTime(c, res),
                downTier.getApproxTime(c, res)
        };
        return doubleApproxTime;
    }
}
