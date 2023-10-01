package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I130Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b7Provider.get(request);
		int p4Val = b8Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b12Provider.get(request);
		int p7Val = b14Provider.get(request);
		int p8Val = b15Provider.get(request);
		int p9Val = b18Provider.get(request);
		int p10Val = b20Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b27Provider.get(request);
		int p13Val = b28Provider.get(request);
		int p14Val = b30Provider.get(request);
		int p15Val = b31Provider.get(request);
		int p16Val = b32Provider.get(request);
		int p17Val = b33Provider.get(request);
		int p18Val = b38Provider.get(request);
		int p19Val = b42Provider.get(request);
		int p20Val = b45Provider.get(request);
		
        try {
            Thread.sleep(76);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = b46Provider.get(request);
		int p22Val = b48Provider.get(request);
		int p23Val = i135Provider.get(request);
		int p24Val = i136Provider.get(request);
		int p25Val = i138Provider.get(request);
		int p26Val = i145Provider.get(request);
		int p27Val = i148Provider.get(request);
		int p28Val = i149Provider.get(request);
		int p29Val = i150Provider.get(request);
		int p30Val = i154Provider.get(request);
		int p31Val = i157Provider.get(request);
		int p32Val = i161Provider.get(request);
		int p33Val = i163Provider.get(request);
		int p34Val = i164Provider.get(request);
		int p35Val = i165Provider.get(request);
		
        try {
            Thread.sleep(48);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p36Val = i167Provider.get(request);
		int p37Val = i170Provider.get(request);
		
        try {
            Thread.sleep(81);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p38Val = i171Provider.get(request);
		int p39Val = i174Provider.get(request);
		int p40Val = i175Provider.get(request);
		int p41Val = i178Provider.get(request);
		int p42Val = i179Provider.get(request);
		int p43Val = i182Provider.get(request);
		int p44Val = i185Provider.get(request);
		int p45Val = i192Provider.get(request);
		int p46Val = i193Provider.get(request);
		int p47Val = i194Provider.get(request);
		int p48Val = i200Provider.get(request);

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
