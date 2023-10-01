package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I159Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b9Provider.get(request);
		int p3Val = b13Provider.get(request);
		int p4Val = b16Provider.get(request);
		int p5Val = b20Provider.get(request);
		
        try {
            Thread.sleep(39);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b23Provider.get(request);
		int p7Val = b24Provider.get(request);
		int p8Val = b25Provider.get(request);
		int p9Val = b26Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b30Provider.get(request);
		int p12Val = b32Provider.get(request);
		int p13Val = b33Provider.get(request);
		int p14Val = b37Provider.get(request);
		int p15Val = b40Provider.get(request);
		int p16Val = b42Provider.get(request);
		int p17Val = b43Provider.get(request);
		int p18Val = b46Provider.get(request);
		int p19Val = b47Provider.get(request);
		int p20Val = b50Provider.get(request);
		
        try {
            Thread.sleep(82);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = i160Provider.get(request);
		int p22Val = i165Provider.get(request);
		int p23Val = i166Provider.get(request);
		
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p24Val = i167Provider.get(request);
		int p25Val = i170Provider.get(request);
		int p26Val = i171Provider.get(request);
		int p27Val = i174Provider.get(request);
		int p28Val = i180Provider.get(request);
		int p29Val = i181Provider.get(request);
		int p30Val = i189Provider.get(request);
		int p31Val = i191Provider.get(request);
		int p32Val = i192Provider.get(request);

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
				p32Val;
    }
}
