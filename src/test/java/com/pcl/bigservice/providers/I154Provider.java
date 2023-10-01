package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I154Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i193Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b12Provider.get(request);
		int p4Val = b13Provider.get(request);
		int p5Val = b14Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b19Provider.get(request);
		int p9Val = b26Provider.get(request);
		int p10Val = b28Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b30Provider.get(request);
		int p13Val = b33Provider.get(request);
		int p14Val = b34Provider.get(request);
		int p15Val = b35Provider.get(request);
		int p16Val = b40Provider.get(request);
		int p17Val = i156Provider.get(request);
		int p18Val = i157Provider.get(request);
		int p19Val = i159Provider.get(request);
		int p20Val = i160Provider.get(request);
		
        try {
            Thread.sleep(43);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = i161Provider.get(request);
		int p22Val = i165Provider.get(request);
		
        try {
            Thread.sleep(57);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p23Val = i166Provider.get(request);
		int p24Val = i167Provider.get(request);
		int p25Val = i169Provider.get(request);
		int p26Val = i174Provider.get(request);
		int p27Val = i175Provider.get(request);
		int p28Val = i176Provider.get(request);
		int p29Val = i177Provider.get(request);
		int p30Val = i178Provider.get(request);
		int p31Val = i179Provider.get(request);
		int p32Val = i180Provider.get(request);
		int p33Val = i185Provider.get(request);
		int p34Val = i186Provider.get(request);
		int p35Val = i190Provider.get(request);
		
        try {
            Thread.sleep(44);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p36Val = i193Provider.get(request);

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
				p36Val;
    }
}
