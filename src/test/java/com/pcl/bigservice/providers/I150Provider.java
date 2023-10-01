package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I150Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b11Provider.get(request);
		int p4Val = b13Provider.get(request);
		int p5Val = b20Provider.get(request);
		int p6Val = b25Provider.get(request);
		int p7Val = b28Provider.get(request);
		int p8Val = b30Provider.get(request);
		
        try {
            Thread.sleep(88);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b31Provider.get(request);
		int p10Val = b32Provider.get(request);
		int p11Val = b34Provider.get(request);
		int p12Val = b36Provider.get(request);
		int p13Val = b37Provider.get(request);
		int p14Val = b38Provider.get(request);
		int p15Val = b39Provider.get(request);
		int p16Val = b42Provider.get(request);
		int p17Val = b44Provider.get(request);
		int p18Val = b47Provider.get(request);
		int p19Val = i151Provider.get(request);
		int p20Val = i154Provider.get(request);
		
        try {
            Thread.sleep(47);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = i156Provider.get(request);
		int p22Val = i157Provider.get(request);
		int p23Val = i158Provider.get(request);
		int p24Val = i164Provider.get(request);
		int p25Val = i167Provider.get(request);
		int p26Val = i169Provider.get(request);
		int p27Val = i171Provider.get(request);
		int p28Val = i174Provider.get(request);
		int p29Val = i175Provider.get(request);
		int p30Val = i176Provider.get(request);
		int p31Val = i177Provider.get(request);
		int p32Val = i179Provider.get(request);
		int p33Val = i180Provider.get(request);
		int p34Val = i185Provider.get(request);
		int p35Val = i189Provider.get(request);
		int p36Val = i190Provider.get(request);
		int p37Val = i191Provider.get(request);
		int p38Val = i196Provider.get(request);
		int p39Val = i197Provider.get(request);
		int p40Val = i198Provider.get(request);
		
        try {
            Thread.sleep(79);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p41Val = i200Provider.get(request);

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
