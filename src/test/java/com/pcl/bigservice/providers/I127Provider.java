package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I127Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b4Provider.get(request);
		
        try {
            Thread.sleep(64);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b8Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b15Provider.get(request);
		int p7Val = b23Provider.get(request);
		int p8Val = b25Provider.get(request);
		int p9Val = b27Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b33Provider.get(request);
		
        try {
            Thread.sleep(33);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b41Provider.get(request);
		int p13Val = b42Provider.get(request);
		int p14Val = b44Provider.get(request);
		int p15Val = b50Provider.get(request);
		int p16Val = i128Provider.get(request);
		int p17Val = i130Provider.get(request);
		int p18Val = i132Provider.get(request);
		int p19Val = i139Provider.get(request);
		int p20Val = i140Provider.get(request);
		int p21Val = i143Provider.get(request);
		int p22Val = i147Provider.get(request);
		int p23Val = i148Provider.get(request);
		int p24Val = i149Provider.get(request);
		int p25Val = i150Provider.get(request);
		int p26Val = i152Provider.get(request);
		int p27Val = i153Provider.get(request);
		int p28Val = i157Provider.get(request);
		int p29Val = i163Provider.get(request);
		int p30Val = i168Provider.get(request);
		int p31Val = i170Provider.get(request);
		int p32Val = i172Provider.get(request);
		int p33Val = i174Provider.get(request);
		int p34Val = i176Provider.get(request);
		int p35Val = i178Provider.get(request);
		int p36Val = i180Provider.get(request);
		int p37Val = i184Provider.get(request);
		int p38Val = i187Provider.get(request);
		int p39Val = i188Provider.get(request);
		int p40Val = i190Provider.get(request);
		int p41Val = i191Provider.get(request);
		int p42Val = i192Provider.get(request);
		int p43Val = i195Provider.get(request);
		int p44Val = i196Provider.get(request);
		
        try {
            Thread.sleep(86);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p45Val = i197Provider.get(request);
		int p46Val = i200Provider.get(request);

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
				p43Val +
				p44Val +
				p45Val +
				p46Val;
    }
}
