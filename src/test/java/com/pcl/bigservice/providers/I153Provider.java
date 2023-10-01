package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I153Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b10Provider.get(request);
		int p3Val = b14Provider.get(request);
		int p4Val = b15Provider.get(request);
		int p5Val = b16Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b22Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b30Provider.get(request);
		int p13Val = b31Provider.get(request);
		int p14Val = b32Provider.get(request);
		int p15Val = b33Provider.get(request);
		int p16Val = b34Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b36Provider.get(request);
		int p19Val = b39Provider.get(request);
		int p20Val = b43Provider.get(request);
		int p21Val = b44Provider.get(request);
		int p22Val = b45Provider.get(request);
		int p23Val = b49Provider.get(request);
		
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p24Val = i154Provider.get(request);
		int p25Val = i155Provider.get(request);
		int p26Val = i159Provider.get(request);
		int p27Val = i161Provider.get(request);
		int p28Val = i166Provider.get(request);
		int p29Val = i167Provider.get(request);
		int p30Val = i168Provider.get(request);
		int p31Val = i173Provider.get(request);
		
        try {
            Thread.sleep(55);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p32Val = i174Provider.get(request);
		int p33Val = i175Provider.get(request);
		int p34Val = i177Provider.get(request);
		int p35Val = i178Provider.get(request);
		
        try {
            Thread.sleep(48);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p36Val = i179Provider.get(request);
		int p37Val = i181Provider.get(request);
		int p38Val = i184Provider.get(request);
		int p39Val = i185Provider.get(request);
		int p40Val = i187Provider.get(request);
		int p41Val = i192Provider.get(request);
		int p42Val = i196Provider.get(request);
		int p43Val = i199Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val;
    }
}
