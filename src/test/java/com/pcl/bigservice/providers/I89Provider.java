package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I89Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b14Provider.get(request);
		int p7Val = b19Provider.get(request);
		int p8Val = b22Provider.get(request);
		int p9Val = b25Provider.get(request);
		int p10Val = b27Provider.get(request);
		int p11Val = b31Provider.get(request);
		int p12Val = b32Provider.get(request);
		int p13Val = b33Provider.get(request);
		int p14Val = b34Provider.get(request);
		int p15Val = b39Provider.get(request);
		int p16Val = b40Provider.get(request);
		int p17Val = b47Provider.get(request);
		
        try {
            Thread.sleep(29);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p18Val = i90Provider.get(request);
		int p19Val = i91Provider.get(request);
		int p20Val = i101Provider.get(request);
		int p21Val = i102Provider.get(request);
		int p22Val = i110Provider.get(request);
		
        try {
            Thread.sleep(64);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p23Val = i114Provider.get(request);
		int p24Val = i115Provider.get(request);
		int p25Val = i118Provider.get(request);
		int p26Val = i123Provider.get(request);
		int p27Val = i125Provider.get(request);
		int p28Val = i126Provider.get(request);
		int p29Val = i135Provider.get(request);
		int p30Val = i138Provider.get(request);
		int p31Val = i140Provider.get(request);
		int p32Val = i142Provider.get(request);
		int p33Val = i143Provider.get(request);
		int p34Val = i145Provider.get(request);
		int p35Val = i146Provider.get(request);
		int p36Val = i148Provider.get(request);
		int p37Val = i150Provider.get(request);
		int p38Val = i154Provider.get(request);
		int p39Val = i157Provider.get(request);
		int p40Val = i158Provider.get(request);
		int p41Val = i168Provider.get(request);
		int p42Val = i173Provider.get(request);
		int p43Val = i177Provider.get(request);
		int p44Val = i183Provider.get(request);
		
        try {
            Thread.sleep(66);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p45Val = i185Provider.get(request);
		int p46Val = i186Provider.get(request);
		int p47Val = i187Provider.get(request);
		int p48Val = i190Provider.get(request);
		int p49Val = i192Provider.get(request);
		int p50Val = i195Provider.get(request);
		int p51Val = i196Provider.get(request);
		int p52Val = i200Provider.get(request);

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
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val;
    }
}
