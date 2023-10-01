package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I145Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b9Provider.get(request);
		int p7Val = b11Provider.get(request);
		int p8Val = b12Provider.get(request);
		int p9Val = b15Provider.get(request);
		int p10Val = b16Provider.get(request);
		
        try {
            Thread.sleep(33);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p11Val = b17Provider.get(request);
		int p12Val = b18Provider.get(request);
		int p13Val = b19Provider.get(request);
		int p14Val = b23Provider.get(request);
		int p15Val = b24Provider.get(request);
		
        try {
            Thread.sleep(75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b26Provider.get(request);
		int p17Val = b33Provider.get(request);
		int p18Val = b34Provider.get(request);
		int p19Val = b37Provider.get(request);
		int p20Val = b41Provider.get(request);
		int p21Val = b42Provider.get(request);
		int p22Val = b44Provider.get(request);
		int p23Val = b48Provider.get(request);
		
        try {
            Thread.sleep(26);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p24Val = i146Provider.get(request);
		int p25Val = i147Provider.get(request);
		int p26Val = i148Provider.get(request);
		int p27Val = i150Provider.get(request);
		int p28Val = i151Provider.get(request);
		int p29Val = i157Provider.get(request);
		int p30Val = i159Provider.get(request);
		int p31Val = i161Provider.get(request);
		int p32Val = i166Provider.get(request);
		int p33Val = i167Provider.get(request);
		int p34Val = i169Provider.get(request);
		int p35Val = i170Provider.get(request);
		int p36Val = i172Provider.get(request);
		int p37Val = i177Provider.get(request);
		int p38Val = i180Provider.get(request);
		int p39Val = i181Provider.get(request);
		int p40Val = i182Provider.get(request);
		int p41Val = i183Provider.get(request);
		int p42Val = i184Provider.get(request);
		int p43Val = i186Provider.get(request);
		int p44Val = i188Provider.get(request);
		int p45Val = i189Provider.get(request);
		int p46Val = i190Provider.get(request);
		int p47Val = i193Provider.get(request);
		int p48Val = i196Provider.get(request);
		int p49Val = i200Provider.get(request);

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
				p49Val;
    }
}
