package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I113Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b21Provider;
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
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b7Provider.get(request);
		int p3Val = b12Provider.get(request);
		int p4Val = b15Provider.get(request);
		int p5Val = b16Provider.get(request);
		int p6Val = b21Provider.get(request);
		int p7Val = b22Provider.get(request);
		int p8Val = b23Provider.get(request);
		int p9Val = b25Provider.get(request);
		int p10Val = b27Provider.get(request);
		int p11Val = b28Provider.get(request);
		int p12Val = b35Provider.get(request);
		int p13Val = b38Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b45Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = b49Provider.get(request);
		int p18Val = b50Provider.get(request);
		int p19Val = i117Provider.get(request);
		int p20Val = i118Provider.get(request);
		int p21Val = i119Provider.get(request);
		
        try {
            Thread.sleep(78);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p22Val = i120Provider.get(request);
		int p23Val = i122Provider.get(request);
		int p24Val = i126Provider.get(request);
		int p25Val = i130Provider.get(request);
		int p26Val = i132Provider.get(request);
		int p27Val = i133Provider.get(request);
		int p28Val = i136Provider.get(request);
		int p29Val = i137Provider.get(request);
		int p30Val = i138Provider.get(request);
		int p31Val = i143Provider.get(request);
		int p32Val = i144Provider.get(request);
		int p33Val = i148Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p34Val = i151Provider.get(request);
		int p35Val = i156Provider.get(request);
		int p36Val = i157Provider.get(request);
		int p37Val = i158Provider.get(request);
		int p38Val = i161Provider.get(request);
		int p39Val = i162Provider.get(request);
		int p40Val = i167Provider.get(request);
		int p41Val = i168Provider.get(request);
		int p42Val = i169Provider.get(request);
		int p43Val = i170Provider.get(request);
		int p44Val = i179Provider.get(request);
		int p45Val = i180Provider.get(request);
		int p46Val = i181Provider.get(request);
		int p47Val = i182Provider.get(request);
		
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p48Val = i184Provider.get(request);
		int p49Val = i185Provider.get(request);
		int p50Val = i186Provider.get(request);
		int p51Val = i188Provider.get(request);
		int p52Val = i194Provider.get(request);
		int p53Val = i197Provider.get(request);
		int p54Val = i200Provider.get(request);

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
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val;
    }
}
