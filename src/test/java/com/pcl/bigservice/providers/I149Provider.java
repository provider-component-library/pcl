package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I149Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b5Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b14Provider.get(request);
		int p5Val = b22Provider.get(request);
		int p6Val = b23Provider.get(request);
		int p7Val = b25Provider.get(request);
		int p8Val = b27Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b30Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b33Provider.get(request);
		int p14Val = b37Provider.get(request);
		int p15Val = b39Provider.get(request);
		int p16Val = b45Provider.get(request);
		int p17Val = b47Provider.get(request);
		int p18Val = b48Provider.get(request);
		int p19Val = b50Provider.get(request);
		int p20Val = i151Provider.get(request);
		int p21Val = i152Provider.get(request);
		int p22Val = i154Provider.get(request);
		int p23Val = i155Provider.get(request);
		int p24Val = i156Provider.get(request);
		int p25Val = i158Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p26Val = i159Provider.get(request);
		int p27Val = i160Provider.get(request);
		int p28Val = i162Provider.get(request);
		int p29Val = i165Provider.get(request);
		int p30Val = i168Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p31Val = i169Provider.get(request);
		int p32Val = i171Provider.get(request);
		int p33Val = i172Provider.get(request);
		int p34Val = i177Provider.get(request);
		int p35Val = i178Provider.get(request);
		int p36Val = i179Provider.get(request);
		int p37Val = i181Provider.get(request);
		int p38Val = i182Provider.get(request);
		int p39Val = i183Provider.get(request);
		int p40Val = i188Provider.get(request);
		int p41Val = i191Provider.get(request);
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
