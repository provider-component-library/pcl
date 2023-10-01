package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I157Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i170Provider;
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
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b8Provider.get(request);
		int p3Val = b10Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b17Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b22Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b31Provider.get(request);
		int p11Val = b33Provider.get(request);
		int p12Val = b37Provider.get(request);
		int p13Val = b38Provider.get(request);
		int p14Val = b42Provider.get(request);
		int p15Val = b43Provider.get(request);
		int p16Val = b45Provider.get(request);
		int p17Val = b46Provider.get(request);
		int p18Val = b48Provider.get(request);
		int p19Val = b49Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p20Val = i159Provider.get(request);
		
        try {
            Thread.sleep(82);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = i162Provider.get(request);
		int p22Val = i163Provider.get(request);
		int p23Val = i167Provider.get(request);
		int p24Val = i170Provider.get(request);
		int p25Val = i174Provider.get(request);
		int p26Val = i175Provider.get(request);
		int p27Val = i177Provider.get(request);
		int p28Val = i178Provider.get(request);
		int p29Val = i179Provider.get(request);
		int p30Val = i180Provider.get(request);
		int p31Val = i183Provider.get(request);
		int p32Val = i185Provider.get(request);
		int p33Val = i188Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p34Val = i190Provider.get(request);
		int p35Val = i194Provider.get(request);
		int p36Val = i196Provider.get(request);
		int p37Val = i197Provider.get(request);
		int p38Val = i199Provider.get(request);

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
				p38Val;
    }
}
