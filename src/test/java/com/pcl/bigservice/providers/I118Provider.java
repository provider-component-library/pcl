package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I118Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b3Provider.get(request);
		int p4Val = b4Provider.get(request);
		int p5Val = b6Provider.get(request);
		int p6Val = b8Provider.get(request);
		int p7Val = b12Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p8Val = b13Provider.get(request);
		int p9Val = b18Provider.get(request);
		int p10Val = b20Provider.get(request);
		int p11Val = b23Provider.get(request);
		int p12Val = b28Provider.get(request);
		int p13Val = b30Provider.get(request);
		int p14Val = b34Provider.get(request);
		int p15Val = b35Provider.get(request);
		int p16Val = b36Provider.get(request);
		int p17Val = b38Provider.get(request);
		int p18Val = b40Provider.get(request);
		int p19Val = b42Provider.get(request);
		int p20Val = b47Provider.get(request);
		int p21Val = b49Provider.get(request);
		int p22Val = i121Provider.get(request);
		int p23Val = i123Provider.get(request);
		int p24Val = i124Provider.get(request);
		int p25Val = i129Provider.get(request);
		int p26Val = i131Provider.get(request);
		int p27Val = i135Provider.get(request);
		int p28Val = i136Provider.get(request);
		int p29Val = i148Provider.get(request);
		int p30Val = i151Provider.get(request);
		int p31Val = i154Provider.get(request);
		int p32Val = i157Provider.get(request);
		int p33Val = i162Provider.get(request);
		int p34Val = i164Provider.get(request);
		int p35Val = i168Provider.get(request);
		int p36Val = i171Provider.get(request);
		int p37Val = i177Provider.get(request);
		int p38Val = i180Provider.get(request);
		int p39Val = i182Provider.get(request);
		int p40Val = i183Provider.get(request);
		int p41Val = i184Provider.get(request);
		int p42Val = i186Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p43Val = i187Provider.get(request);
		int p44Val = i189Provider.get(request);
		
        try {
            Thread.sleep(31);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p45Val = i190Provider.get(request);
		int p46Val = i194Provider.get(request);
		int p47Val = i196Provider.get(request);
		int p48Val = i198Provider.get(request);

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
				p48Val;
    }
}
