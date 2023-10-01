package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I175Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b3Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b13Provider.get(request);
		int p8Val = b14Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b19Provider.get(request);
		int p10Val = b20Provider.get(request);
		int p11Val = b22Provider.get(request);
		int p12Val = b24Provider.get(request);
		int p13Val = b25Provider.get(request);
		
        try {
            Thread.sleep(52);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b26Provider.get(request);
		int p15Val = b27Provider.get(request);
		int p16Val = b32Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b37Provider.get(request);
		int p19Val = b39Provider.get(request);
		int p20Val = b40Provider.get(request);
		int p21Val = b41Provider.get(request);
		int p22Val = b50Provider.get(request);
		int p23Val = i178Provider.get(request);
		int p24Val = i180Provider.get(request);
		int p25Val = i181Provider.get(request);
		int p26Val = i182Provider.get(request);
		
        try {
            Thread.sleep(38);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p27Val = i183Provider.get(request);
		int p28Val = i187Provider.get(request);
		int p29Val = i193Provider.get(request);
		int p30Val = i194Provider.get(request);
		int p31Val = i195Provider.get(request);
		int p32Val = i197Provider.get(request);
		int p33Val = i200Provider.get(request);

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
				p33Val;
    }
}
