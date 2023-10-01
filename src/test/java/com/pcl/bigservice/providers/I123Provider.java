package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I123Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i127Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b9Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b12Provider.get(request);
		int p8Val = b14Provider.get(request);
		int p9Val = b18Provider.get(request);
		int p10Val = b22Provider.get(request);
		int p11Val = b23Provider.get(request);
		int p12Val = b25Provider.get(request);
		
        try {
            Thread.sleep(59);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p13Val = b26Provider.get(request);
		int p14Val = b28Provider.get(request);
		int p15Val = b31Provider.get(request);
		
        try {
            Thread.sleep(54);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b34Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b36Provider.get(request);
		int p19Val = b40Provider.get(request);
		int p20Val = b41Provider.get(request);
		int p21Val = b43Provider.get(request);
		int p22Val = b44Provider.get(request);
		int p23Val = b45Provider.get(request);
		int p24Val = b47Provider.get(request);
		int p25Val = i125Provider.get(request);
		int p26Val = i126Provider.get(request);
		int p27Val = i127Provider.get(request);
		int p28Val = i130Provider.get(request);
		int p29Val = i137Provider.get(request);
		int p30Val = i138Provider.get(request);
		int p31Val = i141Provider.get(request);
		int p32Val = i142Provider.get(request);
		int p33Val = i144Provider.get(request);
		int p34Val = i148Provider.get(request);
		int p35Val = i152Provider.get(request);
		int p36Val = i153Provider.get(request);
		int p37Val = i154Provider.get(request);
		int p38Val = i155Provider.get(request);
		
        try {
            Thread.sleep(76);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p39Val = i157Provider.get(request);
		int p40Val = i159Provider.get(request);
		int p41Val = i162Provider.get(request);
		int p42Val = i164Provider.get(request);
		int p43Val = i170Provider.get(request);
		int p44Val = i171Provider.get(request);
		int p45Val = i175Provider.get(request);
		int p46Val = i180Provider.get(request);
		int p47Val = i185Provider.get(request);
		int p48Val = i191Provider.get(request);
		int p49Val = i194Provider.get(request);
		int p50Val = i195Provider.get(request);
		int p51Val = i196Provider.get(request);

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
				p51Val;
    }
}
