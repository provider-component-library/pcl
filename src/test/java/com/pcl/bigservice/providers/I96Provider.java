package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I96Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
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
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b8Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b12Provider.get(request);
		int p8Val = b17Provider.get(request);
		int p9Val = b18Provider.get(request);
		int p10Val = b19Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b25Provider.get(request);
		int p13Val = b26Provider.get(request);
		int p14Val = b28Provider.get(request);
		int p15Val = b34Provider.get(request);
		int p16Val = b36Provider.get(request);
		int p17Val = b42Provider.get(request);
		int p18Val = b46Provider.get(request);
		int p19Val = b50Provider.get(request);
		int p20Val = i98Provider.get(request);
		int p21Val = i99Provider.get(request);
		int p22Val = i107Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p23Val = i113Provider.get(request);
		int p24Val = i120Provider.get(request);
		int p25Val = i121Provider.get(request);
		int p26Val = i126Provider.get(request);
		int p27Val = i128Provider.get(request);
		int p28Val = i135Provider.get(request);
		int p29Val = i138Provider.get(request);
		int p30Val = i139Provider.get(request);
		int p31Val = i141Provider.get(request);
		int p32Val = i143Provider.get(request);
		int p33Val = i144Provider.get(request);
		int p34Val = i147Provider.get(request);
		
        try {
            Thread.sleep(59);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p35Val = i148Provider.get(request);
		int p36Val = i149Provider.get(request);
		int p37Val = i153Provider.get(request);
		int p38Val = i158Provider.get(request);
		int p39Val = i160Provider.get(request);
		int p40Val = i162Provider.get(request);
		int p41Val = i163Provider.get(request);
		int p42Val = i166Provider.get(request);
		int p43Val = i170Provider.get(request);
		int p44Val = i172Provider.get(request);
		
        try {
            Thread.sleep(75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p45Val = i173Provider.get(request);
		int p46Val = i174Provider.get(request);
		int p47Val = i175Provider.get(request);
		int p48Val = i177Provider.get(request);
		int p49Val = i178Provider.get(request);
		int p50Val = i185Provider.get(request);
		int p51Val = i186Provider.get(request);
		int p52Val = i188Provider.get(request);
		int p53Val = i198Provider.get(request);

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
				p52Val +
				p53Val;
    }
}
