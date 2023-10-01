package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I164Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i193Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b5Provider.get(request);
		int p2Val = b9Provider.get(request);
		
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(21);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b10Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b20Provider.get(request);
		int p7Val = b22Provider.get(request);
		int p8Val = b24Provider.get(request);
		int p9Val = b27Provider.get(request);
		int p10Val = b30Provider.get(request);
		int p11Val = b31Provider.get(request);
		int p12Val = b33Provider.get(request);
		int p13Val = b34Provider.get(request);
		
        try {
            Thread.sleep(36);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b42Provider.get(request);
		int p15Val = b44Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = i165Provider.get(request);
		int p18Val = i166Provider.get(request);
		int p19Val = i167Provider.get(request);
		int p20Val = i168Provider.get(request);
		int p21Val = i169Provider.get(request);
		int p22Val = i173Provider.get(request);
		int p23Val = i174Provider.get(request);
		int p24Val = i175Provider.get(request);
		int p25Val = i178Provider.get(request);
		int p26Val = i180Provider.get(request);
		int p27Val = i184Provider.get(request);
		int p28Val = i191Provider.get(request);
		int p29Val = i193Provider.get(request);

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
				p29Val;
    }
}
