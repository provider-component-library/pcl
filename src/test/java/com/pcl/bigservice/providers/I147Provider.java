package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I147Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b7Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b18Provider.get(request);
		int p7Val = b19Provider.get(request);
		int p8Val = b23Provider.get(request);
		int p9Val = b26Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p10Val = b27Provider.get(request);
		int p11Val = b31Provider.get(request);
		int p12Val = b33Provider.get(request);
		int p13Val = b34Provider.get(request);
		
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b35Provider.get(request);
		int p15Val = b40Provider.get(request);
		int p16Val = b41Provider.get(request);
		int p17Val = b42Provider.get(request);
		int p18Val = b43Provider.get(request);
		int p19Val = b44Provider.get(request);
		int p20Val = b46Provider.get(request);
		
        try {
            Thread.sleep(77);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = b48Provider.get(request);
		int p22Val = i149Provider.get(request);
		int p23Val = i153Provider.get(request);
		int p24Val = i157Provider.get(request);
		int p25Val = i160Provider.get(request);
		int p26Val = i161Provider.get(request);
		int p27Val = i164Provider.get(request);
		int p28Val = i165Provider.get(request);
		int p29Val = i168Provider.get(request);
		int p30Val = i169Provider.get(request);
		int p31Val = i175Provider.get(request);
		int p32Val = i176Provider.get(request);
		int p33Val = i178Provider.get(request);
		int p34Val = i179Provider.get(request);
		int p35Val = i181Provider.get(request);
		int p36Val = i182Provider.get(request);
		int p37Val = i184Provider.get(request);
		int p38Val = i185Provider.get(request);
		int p39Val = i186Provider.get(request);
		int p40Val = i187Provider.get(request);
		int p41Val = i195Provider.get(request);
		int p42Val = i196Provider.get(request);
		int p43Val = i197Provider.get(request);

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
