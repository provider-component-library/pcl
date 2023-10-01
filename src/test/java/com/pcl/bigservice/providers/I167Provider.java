package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I167Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i177Provider;
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
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b9Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b12Provider.get(request);
		
        try {
            Thread.sleep(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p8Val = b13Provider.get(request);
		int p9Val = b19Provider.get(request);
		int p10Val = b20Provider.get(request);
		int p11Val = b21Provider.get(request);
		int p12Val = b22Provider.get(request);
		int p13Val = b23Provider.get(request);
		int p14Val = b24Provider.get(request);
		int p15Val = b26Provider.get(request);
		int p16Val = b29Provider.get(request);
		int p17Val = b31Provider.get(request);
		int p18Val = b40Provider.get(request);
		int p19Val = b42Provider.get(request);
		int p20Val = b44Provider.get(request);
		int p21Val = b45Provider.get(request);
		int p22Val = b47Provider.get(request);
		int p23Val = i169Provider.get(request);
		int p24Val = i171Provider.get(request);
		int p25Val = i172Provider.get(request);
		int p26Val = i175Provider.get(request);
		
        try {
            Thread.sleep(66);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p27Val = i177Provider.get(request);
		int p28Val = i179Provider.get(request);
		int p29Val = i181Provider.get(request);
		int p30Val = i182Provider.get(request);
		int p31Val = i183Provider.get(request);
		int p32Val = i188Provider.get(request);
		int p33Val = i194Provider.get(request);
		
        try {
            Thread.sleep(57);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p34Val = i195Provider.get(request);
		int p35Val = i197Provider.get(request);
		int p36Val = i198Provider.get(request);

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
