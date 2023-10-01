package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I140Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b20Provider.get(request);
		int p9Val = b25Provider.get(request);
		int p10Val = b26Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b36Provider.get(request);
		int p15Val = b39Provider.get(request);
		int p16Val = b45Provider.get(request);
		int p17Val = b48Provider.get(request);
		int p18Val = b49Provider.get(request);
		int p19Val = i142Provider.get(request);
		int p20Val = i146Provider.get(request);
		int p21Val = i147Provider.get(request);
		int p22Val = i148Provider.get(request);
		int p23Val = i149Provider.get(request);
		int p24Val = i152Provider.get(request);
		int p25Val = i157Provider.get(request);
		int p26Val = i158Provider.get(request);
		
        try {
            Thread.sleep(78);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p27Val = i164Provider.get(request);
		
        try {
            Thread.sleep(32);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p28Val = i165Provider.get(request);
		int p29Val = i169Provider.get(request);
		int p30Val = i172Provider.get(request);
		int p31Val = i175Provider.get(request);
		int p32Val = i177Provider.get(request);
		int p33Val = i180Provider.get(request);
		int p34Val = i181Provider.get(request);
		int p35Val = i190Provider.get(request);
		int p36Val = i192Provider.get(request);
		
        try {
            Thread.sleep(43);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p37Val = i195Provider.get(request);
		int p38Val = i197Provider.get(request);
		int p39Val = i199Provider.get(request);

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
				p39Val;
    }
}
