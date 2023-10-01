package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I135Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b10Provider.get(request);
		int p3Val = b11Provider.get(request);
		
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b19Provider.get(request);
		int p5Val = b25Provider.get(request);
		int p6Val = b26Provider.get(request);
		int p7Val = b27Provider.get(request);
		int p8Val = b29Provider.get(request);
		int p9Val = b31Provider.get(request);
		int p10Val = b32Provider.get(request);
		int p11Val = b34Provider.get(request);
		int p12Val = b37Provider.get(request);
		int p13Val = b38Provider.get(request);
		int p14Val = b39Provider.get(request);
		int p15Val = b40Provider.get(request);
		int p16Val = b42Provider.get(request);
		int p17Val = b45Provider.get(request);
		int p18Val = b49Provider.get(request);
		int p19Val = i137Provider.get(request);
		int p20Val = i139Provider.get(request);
		int p21Val = i141Provider.get(request);
		int p22Val = i143Provider.get(request);
		int p23Val = i144Provider.get(request);
		int p24Val = i150Provider.get(request);
		
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i151Provider.get(request);
		int p26Val = i153Provider.get(request);
		int p27Val = i154Provider.get(request);
		int p28Val = i155Provider.get(request);
		int p29Val = i158Provider.get(request);
		int p30Val = i159Provider.get(request);
		int p31Val = i162Provider.get(request);
		
        try {
            Thread.sleep(88);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p32Val = i163Provider.get(request);
		int p33Val = i169Provider.get(request);
		int p34Val = i178Provider.get(request);
		int p35Val = i181Provider.get(request);
		int p36Val = i183Provider.get(request);
		int p37Val = i184Provider.get(request);
		int p38Val = i186Provider.get(request);
		int p39Val = i187Provider.get(request);
		int p40Val = i190Provider.get(request);
		int p41Val = i194Provider.get(request);
		int p42Val = i196Provider.get(request);
		int p43Val = i197Provider.get(request);
		int p44Val = i198Provider.get(request);
		int p45Val = i199Provider.get(request);

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
				p45Val;
    }
}
