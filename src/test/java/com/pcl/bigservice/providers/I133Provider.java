package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I133Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b11Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b15Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b20Provider.get(request);
		int p9Val = b22Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b25Provider.get(request);
		int p13Val = b26Provider.get(request);
		
        try {
            Thread.sleep(33);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b27Provider.get(request);
		int p15Val = b29Provider.get(request);
		
        try {
            Thread.sleep(33);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b32Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b43Provider.get(request);
		int p19Val = b44Provider.get(request);
		int p20Val = b48Provider.get(request);
		int p21Val = b49Provider.get(request);
		int p22Val = i134Provider.get(request);
		int p23Val = i138Provider.get(request);
		int p24Val = i143Provider.get(request);
		int p25Val = i145Provider.get(request);
		int p26Val = i146Provider.get(request);
		int p27Val = i154Provider.get(request);
		int p28Val = i156Provider.get(request);
		
        try {
            Thread.sleep(48);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p29Val = i160Provider.get(request);
		int p30Val = i164Provider.get(request);
		int p31Val = i169Provider.get(request);
		int p32Val = i170Provider.get(request);
		int p33Val = i171Provider.get(request);
		int p34Val = i172Provider.get(request);
		int p35Val = i178Provider.get(request);
		int p36Val = i180Provider.get(request);
		int p37Val = i181Provider.get(request);
		int p38Val = i184Provider.get(request);
		int p39Val = i187Provider.get(request);
		int p40Val = i188Provider.get(request);
		int p41Val = i189Provider.get(request);

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
				p41Val;
    }
}
